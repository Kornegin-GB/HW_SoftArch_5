package ru.fsv67;

public interface UILayer {
    void openProject(String fileName);

    void showProjectSettings();

    void saveProject();

    void printAllModels();

    void printAllTextures();

    void renderAll();

    void renderModel(int i);

    void removeModel(int i); // HW
}
