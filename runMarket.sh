#!/usr/bin/env bash

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/ >& ./results/market2a_6s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/ >& ./results/market2a_6s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/ >& ./results/market2a_6s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_6S/ >& ./results/market2a_6s_cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/ >& ./results/market2a_8s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/ >& ./results/market2a_8s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/ >& ./results/market2a_8s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_8S/ >& ./results/market2a_8s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/ >& ./results/market2a_10s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/ >& ./results/market2a_10s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/ >& ./results/market2a_10s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_10S/ >& ./results/market2a_10s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/ >& ./results/market2a_12s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/ >& ./results/market2a_12s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/ >& ./results/market2a_12s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_12S/ >& ./results/market2a_12s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/ >& ./results/market2a_14s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/ >& ./results/market2a_14s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/ >& ./results/market2a_14s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange2A_14S/ >& ./results/market2a_14s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/ >& ./results/market4a_6s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/ >& ./results/market4a_6s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/ >& ./results/market4a_6s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_6S/ >& ./results/market4a_6s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/ >& ./results/market4a_8s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/ >& ./results/market4a_8s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/ >& ./results/market4a_8s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_8S/ >& ./results/market4a_8s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/ >& ./results/market4a_10s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/ >& ./results/market4a_10s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/ >& ./results/market4a_10s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_10S/ >& ./results/market4a_10s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/ >& ./results/market4a_12s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/ >& ./results/market4a_12s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/ >& ./results/market4a_12s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_12S/ >& ./results/market4a_12s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/ >& ./results/market4a_14s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/ >& ./results/market4a_14s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/ >& ./results/market4a_14s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange4A_14S/ >& ./results/market4a_14s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/ >& ./results/market6a_6s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/ >& ./results/market6a_6s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/ >& ./results/market6a_6s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_6S/ >& ./results/market6a_6s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/ >& ./results/market6a_8s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/ >& ./results/market6a_8s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/ >& ./results/market6a_8s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_8S/ >& ./results/market6a_8s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/ >& ./results/market6a_10s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/ >& ./results/market6a_10s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/ >& ./results/market6a_10s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_10S/ >& ./results/market6a_10s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/ >& ./results/market6a_12s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/ >& ./results/market6a_12s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/ >& ./results/market6a_12s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_12S/ >& ./results/market6a_12s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/ >& ./results/market6a_14s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/ >& ./results/market6a_14s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/ >& ./results/market6a_14s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange6A_14S/ >& ./results/market6a_14s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/ >& ./results/market8a_6s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/ >& ./results/market8a_6s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/ >& ./results/market8a_6s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_6S/ >& ./results/market8a_6s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/ >& ./results/market8a_8s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/ >& ./results/market8a_8s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/ >& ./results/market8a_8s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_8S/ >& ./results/market8a_8s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/ >& ./results/market8a_10s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/ >& ./results/market8a_10s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/ >& ./results/market8a_10s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_10S/ >& ./results/market8a_10s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/ >& ./results/market8a_12s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/ >& ./results/market8a_12s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/ >& ./results/market8a_12s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_12S/ >& ./results/market8a_12s_cas.txt


./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=2core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/ >& ./results/market8a_14s_2cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=3core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/ >& ./results/market8a_14s_3cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=4core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/ >& ./results/market8a_14s_4cas.txt

./executables/runlim --space-limit=12288 --time-limit=1800 java -Xmx8192m -DentityExpansionLimit=1000000 -cp bin:./lib/DLVwrapper-v4.2.jar algorithm.NTUFacade -reasoning=core -stats -meta=/home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/meta.xml /home/cesco/Workspace/GraphGenerator/outputMarketExchange8A_14S/ >& ./results/market8a_14s_cas.txt
