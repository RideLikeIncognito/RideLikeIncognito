import java.awt.*;
class NotePad
{
	NotePad()
	{
	Frame f=new Frame("Menu and MenuItems");
	MenuBar mb=new MenuBar();
	Menu m=new Menu("File");
	Menu m1=new Menu("Edit");
	Menu m2=new Menu("Format");
	Menu m3=new Menu("View");
	Menu m4=new Menu("Help");

	MenuItem i1=new MenuItem("New              Ctrl+N");
	MenuItem i2=new MenuItem("NewWindow  Ctrl+Shift+N");
	MenuItem i3=new MenuItem("Open...          Ctrl+O");
	MenuItem i4=new MenuItem("Save             Ctrl+S");
	MenuItem i5=new MenuItem("SaveAs...  Ctrl+Shift+S");
	MenuItem i6=new MenuItem("Exit");

	MenuItem i7=new MenuItem("Undo              Ctrl+Z");
	MenuItem i8=new MenuItem("Cut               Ctrl+X");
	MenuItem i9=new MenuItem("Copy              Ctrl+C");
	MenuItem i10=new MenuItem("Paste            Ctrl+V");
	MenuItem i11=new MenuItem("Delete              Del");
	MenuItem i12=new MenuItem("Find             Ctrl+F");
	MenuItem i13=new MenuItem("FindNext             F3");
	MenuItem i14=new MenuItem("FindPrevious   Shift+F3");
	MenuItem i15=new MenuItem("Replace          Ctrl+H");
	MenuItem i16=new MenuItem("Go To..          Ctrl+G");
	MenuItem i17=new MenuItem("Select All       Ctrl+A");
	MenuItem i18=new MenuItem("Time/Date            F5");


	MenuItem i19=new MenuItem("Word Wrap");
	MenuItem i20=new MenuItem("Font...");

	MenuItem i21=new MenuItem("Zoom        >");
	MenuItem i22=new MenuItem("Status Bar");

	MenuItem i23=new MenuItem("View help");
	MenuItem i24=new MenuItem("Send Feedback");
	MenuItem i25=new MenuItem("About notepad");

	m.add(i1);
	m.add(i2);
	m.add(i3);
	m.add(i4);
	m.add(i5);
	m.add(i6);

	m1.add(i7);
	m1.add(i8);
	m1.add(i9);
	m1.add(i10);
	m1.add(i11);
	m1.add(i12);
	m1.add(i13);
	m1.add(i14);
	m1.add(i15);
	m1.add(i16);
	m1.add(i17);
	m1.add(i18);

	m2.add(i19);
	m2.add(i20);

	m3.add(i21);
	m3.add(i22);

	m4.add(i23);
	m4.add(i24);
	m4.add(i25);

	mb.add(m);
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	mb.add(m4);

	f.setMenuBar(mb);
	f.setVisible(true);
	f.setSize(500,500);
	f.setLayout(null);
}
public static void main(String[] args)
{
	new NotePad();
}
}






