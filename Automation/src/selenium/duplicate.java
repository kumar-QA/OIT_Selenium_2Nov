package selenium;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="automationtesting";
		char[] str1=str.toCharArray();
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			count=1;
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i]==str1[j]&&str1[i]!='0')
				{
					count++;
					str1[j]='0';
					
				}

			}
			if(count>1)
			System.out.println(str1[i]+" "+count);
			
		}
		}



	}

