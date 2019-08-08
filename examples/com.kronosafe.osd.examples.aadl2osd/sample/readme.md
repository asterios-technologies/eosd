This is a simplified example of AADL to Open System Description transformation demonstrated on a simple producer/consumer aadl example.

# Pre-requisites

The example dependencies are:

|                         Tools                         |                              Description                               |
| ----------------------------------------------------- | :--------------------------------------------------------------------- |
| `OSATE 2.3.6`                         		| [Bundle for the AADL transformation example](https://osate-build.sei.cmu.edu/download/osate/stable/2.3.6/products/) |
| `ATL 4.0.1`                               		| The ATL Transformation Language used for the AADL2OSD Transformation available as an Eclipse Update Site [ATL Releases P2 Repository](http://download.eclipse.org/mmt/atl/updates/releases) |
| `EOSD 2.0.0`                               		| [The Open System Description Eclipse integration](https://github.com/krono-safe/eosd/releases) |
| `ASTERIOS Designer K19.0.X (optional)`     		| The [ASTERIOS Designer](https://www.krono-safe.com/asterios-designer/) tool to generate the dynamic PsyC architecture  |

# How to install the environment ?

Download and extract the OSATE bundle, then install the eOSD and the ATL update sites from the Eclipse installation widget (`Help -> Install New Software -> Add`) in the OSATE bundle.

# How to generate the OSD files ?

To launch the transformation, verify that the ATL and AADL features are added to the project:

- `right click on the project name -> configure -> Convert to ATL Project`
- `right click on the project name -> configure -> Enable AADL Nature`

Launch the transformation from the Eclipse launch menu: `aadl2osd`

# How to generate the PsyC files ?

If you have ASTERIOS Designer 19.0.X, you can launch the Psy generation with the script `launch\timing_generation.bat`
