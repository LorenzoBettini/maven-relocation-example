# Maven Relocation Example

This repository demonstrates Maven artifact relocation with a multi-module setup.

## Structure

The repository is organized into several multi-module Maven projects:

### 1. `foo.parent`

This is the main set of Maven artifacts (the "real" ones):

- **foo.example1**  
- **foo.example2**  
  - _Note: `foo.example2` depends on `foo.example1`._

These modules are the actual implementations and are published under the groupId `foo`.

### 2. `bar.parent`

This mirrors the structure of `foo.parent`, but all modules here are set up solely to relocate to the corresponding `foo` artifacts:

- **bar.example1** (relocates to `foo.example1`)
- **bar.example2** (relocates to `foo.example2`)

Both have the same artifactIds as their `foo` counterparts, but their groupId is `bar`. Their POMs use the `<distributionManagement><relocation>` mechanism to point to the new `foo` coordinates.

### 3. Example Projects

There are two additional projects that demonstrate consumption of the relocated artifacts:

- **barclient1** depends on `bar:foo.example1` (which is relocated to `foo:foo.example1`)
- **barclient2** depends on `bar:foo.example2` (which is relocated to `foo:foo.example2`)
  - _Since `foo:foo.example2` depends on `foo:foo.example1`, this shows how transitive relocation works._

## Key Points

- **Relocation**: The `bar` artifacts are empty and only exist to redirect Maven builds to the `foo` artifacts using relocation.
- **Dependency**: `foo.example2` depends on `foo.example1`, so using the relocated `bar:foo.example2` will also bring in `foo:foo.example1` due to transitive dependencies.

## How to Recreate the Examples Locally

You can try out the relocation setup locally by following these steps:

1. **Install the real artifacts (foo.parent and its modules):**

   From the root of the repository, run:
   ```sh
   cd foo.parent
   mvn clean install
   ```
2. **Install the relocation modules (bar.parent and its modules):**
   ```sh
   cd ../bar.parent
   mvn clean install
   ```
3. **Build the example clients:**
   ```sh
   cd ../barclient1
   mvn clean package

   cd ../barclient1
   mvn clean package
   ```
