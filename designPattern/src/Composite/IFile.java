package Composite;

import java.util.List;

public interface IFile {
    public void display();

    public boolean add(IFile file);

    public boolean remove(IFile file);

    public List<IFile> getChild();
}
