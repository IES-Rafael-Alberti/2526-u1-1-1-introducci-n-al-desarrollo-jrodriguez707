#include <stdio.h>

int main() {
    char nombre[50];
    int año, edad;
    printf("¿Cómo te llamas? ");
    scanf("%s", nombre);
    printf("¿En qué año naciste? ");
    scanf("%d", &año);
    edad = 2025 - año;
    printf("Hola %s, tienes %d años. Este programa está hecho en el lenguaje de programación: C.\n", nombre, edad);
    return 0;
}
