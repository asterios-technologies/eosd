call timing_generation_clean.bat
xcopy /y ..\configurations\*.* ..\gen-timing\
cd ..\models
designer -t -i -s producer_consumer.oasd -a producer_consumer.oad -m -b 2 -o appli -f ..\gen-timing
xcopy /y ..\manual-src\*.* ..\gen-timing\