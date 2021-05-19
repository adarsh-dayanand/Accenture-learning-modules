for F in ${*}
do
   echo
   c=$( wc -c < ${F})
   echo "Number of characters in ${F} is $c"
   echo
   w=$( wc -w < ${F} )
   echo "Number of words in ${F} is $w"
   echo
   l=$( wc -l < ${F})
   echo "Number of lines in ${F} is $l"
done