class StringBufferHelper
{
    //@author: Apurv rana last updated 9:02 03/12/2018 monday 
    
//utility method to remove duplicates from string buffer
    public StringBuffer removeDuplicate(String s3) 
    {
        StringBuffer s =new StringBuffer(s3);
StringBuffer s1 =new StringBuffer();
s1.append(s.charAt(0));
for(int i=1;i<s.length();i++)
{
    int count =0;
    for(int j=i-1;j>=0;j--)
    {
    
    if(s.charAt(i)==s.charAt(j))
    {
        break;
        
     }
    else
    {
        count++;
    }
    
    if(count==i)
    {
        s1.append(s.charAt(i));
    }
        }
    
}
return s1;
    }
}
