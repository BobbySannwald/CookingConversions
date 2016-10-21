
public class Rec
	{
		String name;
		String ing1;
		double ingNum1;
		String ing2;
		double ingNum2;
		String ing3;
		double ingNum3;
		double servSize;
		
		public void setIngNum1(double ingNum1)
			{
				this.ingNum1 = ingNum1;
			}

		public void setIngNum2(double ingNum2)
			{
				this.ingNum2 = ingNum2;
			}

		public void setIngNum3(double ingNum3)
			{
				this.ingNum3 = ingNum3;
			}

		public Rec(String n, String j, double g,String k, double h, String l, double d, double s)
			{
				name = n;
				ing1 = j;
				ingNum1 = g;
				ing2 = k;
				ingNum2 = h;
				ing3 = l;
				ingNum3 = d;
				servSize = s;		
			}

		public double getIngNum1()
			{
				return ingNum1;
			}

		public void setIngNum1(int ingNum1)
			{
				this.ingNum1 = ingNum1;
			}

		public double getIngNum2()
			{
				return ingNum2;
			}

		public void setIngNum2(int ingNum2)
			{
				this.ingNum2 = ingNum2;
			}

		public double getIngNum3()
			{
				return ingNum3;
			}

		public void setIngNum3(int ingNum3)
			{
				this.ingNum3 = ingNum3;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getIng1()
			{
				return ing1;
			}

		public void setIng1(String ing1)
			{
				this.ing1 = ing1;
			}

		public String getIng2()
			{
				return ing2;
			}

		public void setIng2(String ing2)
			{
				this.ing2 = ing2;
			}

		public String getIng3()
			{
				return ing3;
			}

		public void setIng3(String ing3)
			{
				this.ing3 = ing3;
			}

		public double getServSize()
			{
				return servSize;
			}

		public void setServSize(double servSize)
			{
				this.servSize = servSize;
			}
	}
