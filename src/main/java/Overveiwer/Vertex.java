package Overveiwer;

import java.awt.*;

class Vertex {
    double y; // ось у
    double x; // ось х
    double z; //ось z

    Vertex(double y, double x, double z) {
        this.y = y;
        this.x = x;
        this.z = z;
    }

}

class Triangle{
    Vertex y;
    Vertex x;
    Vertex z;
    Color color;
    Triangle(Vertex y, Vertex x, Vertex z, Color color){
        this.y = y;
        this.x = x;
        this.z = z;
        this.color = color;

    }
}
