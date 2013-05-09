#!/bin/sh

now=$(date +"%T")
a=$(echo $now | cut -d':' -f1)

if [ "$a" -lt 12]; then
	clear
	echo "Good Morning, $USER"

if [ "$a" -e 12 ]; then
	clear
	echo "Good Afternoon, $USER"
fi

else
	clear
	echo "Good night, $USER"
fi

