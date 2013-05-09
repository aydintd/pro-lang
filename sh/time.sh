#!/bin/sh

now=$(date +"%T")
a=$(echo $now | cut -d':' -f1)

if [ "$a" -ge 00 ] && [ "$a" -lt 06 ]; then
	clear
	echo "Good Night, $USER"

elif [ "$a" -ge 06 ] && [ "$a" -lt 12 ]; then
	clear
	echo "Good Morning, $USER"

elif [ "$a" -ge 12 ] && [ "$a" -le 18 ]; then
	clear
	echo "Good Afternoon, $USER"
else
	echo "Good Evening, $USER"

fi

