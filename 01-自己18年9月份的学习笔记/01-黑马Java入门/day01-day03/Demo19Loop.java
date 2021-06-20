/*
循环嵌套中的跳转语句

1.break或continue只能作用于当前所属层循环。
2.如果希望写在内层，但是作用于外层循环，那该怎么办？

for(...){	//外层循环
	for(...)	//内层循环
				
		break  标签名称；
	}
}
	
	
1.break和continue
*/
public class Demo19Loop{
	public static void main(String[] args){
		int count=0;
		
		label:for(int i=1;i <=10;i++){		//外层循环10次
		
			//if(i ==3){
				//continue;
			//}
		
			for(int j=1;j <=5;j++){	//内层循环5次
				//if (j ==3){
					//continue;
				//}
				if(j ==3){
					break label;		//不光崩里面，外面也崩了
				}
				count++;
				
			}	
		}
		
		System.out.println("总次数：" + count);	
	}
}
		
		
	