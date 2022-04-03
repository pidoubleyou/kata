#!/bin/bash

seconds=$(($1 % 60))
minutes=$(($1 / 60 % 60))
hours=$(($1 / 3600))

echo $(printf "%02d:%02d:%02d" "$hours" "$minutes" "$seconds")
