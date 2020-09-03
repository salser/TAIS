package classgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class ClassGenerator {

	public static void main(String[] args) {

		System.out.println("yes");
		readPropertiesFile("C:\\Users\\henry\\Documents\\TAIS\\TAIS\\CodeGen\\src", "classgen.properties");
	}

	private static void readPropertiesFile(String filePath, String fileName) {
		try {
			File file = new File(filePath + "\\" + fileName);
			Scanner scn = new Scanner(file);
			String pck = "";
			String name = "";
			String parent = "";
			while (scn.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(scn.nextLine(), "=");
				switch (st.nextToken().trim()) {
				case "package":
					if (st.hasMoreTokens())
					pck = st.nextToken().trim();
					break;
				case "name":
					if (st.hasMoreTokens())
					name = st.nextToken().trim();
					break;
				case "parent":
					if (st.hasMoreTokens())
						parent = st.nextToken().trim();
					break;
				default:
					break;
				}
			}
			scn.close();
			if (!pck.equals("")) {
				File f = new File(filePath + "\\" + pck);
				f.mkdir();
				if (!name.equals("")) {
					PrintWriter writer = null;
					writer = new PrintWriter(new File(filePath + "\\" + pck + "\\" + name + ".java"));
					writer.write("package " + pck + ";\n\n");
					if (!parent.equals("")) {
						writer.write("public class " + name + " extends " + parent + " {\n}");
					} else {
						writer.write("public class " + name + " {\n}");
					}
					writer.flush();
					writer.close();
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
