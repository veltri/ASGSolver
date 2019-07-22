#!/usr/bin/env bash

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_2/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_2/ >& ./results/hedonic_2_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_2/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_2/ >& ./results/hedonic_2_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_2/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_2/ >& ./results/hedonic_2_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_2/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_2/ >& ./results/hedonic_2_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_4/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_4/ >& ./results/hedonic_4_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_4/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_4/ >& ./results/hedonic_4_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_4/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_4/ >& ./results/hedonic_4_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_4/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_4/ >& ./results/hedonic_4_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_6/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_6/ >& ./results/hedonic_6_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_6/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_6/ >& ./results/hedonic_6_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_6/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_6/ >& ./results/hedonic_6_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_6/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_6/ >& ./results/hedonic_6_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_8/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_8/ >& ./results/hedonic_8_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_8/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_8/ >& ./results/hedonic_8_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_8/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_8/ >& ./results/hedonic_8_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_8/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_8/ >& ./results/hedonic_8_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_10/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_10/ >& ./results/hedonic_10_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_10/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_10/ >& ./results/hedonic_10_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_10/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_10/ >& ./results/hedonic_10_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_10/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_10/ >& ./results/hedonic_10_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_12/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_12/ >& ./results/hedonic_12_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_12/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_12/ >& ./results/hedonic_12_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_12/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_12/ >& ./results/hedonic_12_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputHedonic_12/meta.xml /home/cesco/Workspace/GraphGenerator/outputHedonic_12/ >& ./results/hedonic_12_cas.txt
