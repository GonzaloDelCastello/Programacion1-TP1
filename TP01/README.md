# Sistema de Gestión Académica (Preparación Examen Libre)

## 📌 Estado del Proyecto
* **Última actualización:** [06/02/2026]
* **Nivel de Avance:** Terminando TP1
* **Próximo objetivo:** ??

## 🚀 Cómo ejecutar el proyecto
*(Nota para mi yo del futuro: Si sale error de "Class not found", revisar esto)*
1. Abrir la carpeta raíz en VS Code.
2. Ir al archivo `App.java` en `src/App.java`.
3. Verificar que no haya `package` incorrectos.
4. Darle a "Run".

## 🗺️ Mapa del Código (Diccionario de Clases)

### Paquete: Modelos (Entidades)
| Clase | Responsabilidad Principal | Estado |
| :--- | :--- | :--- |
| **Universidad** | Contenedor principal. Tiene array de Carreras. | ✅ Terminada |
| **Carrera** | Plan de estudios. Tiene array de Materias. | ✅ Terminada |
| **Materia** | Asignatura individual. Tiene array de Estudiantes (inscriptos). | ✅ Terminada |
| **Estudiante** | Alumno. Tiene array de Materias (cursadas) y atributos personales. | ⚠️ Falta heredar de Persona |
| **Persona** | (Nueva) Clase padre para herencia. | ❌ Pendiente |

### Paquete: Estructuras de Datos (Para TP2 y TP3)
| Clase | Descripción |
| :--- | :--- |
| **Nodo** | Elemento base para listas enlazadas. |
| **ListaEnlazada** | Reemplazo dinámico de los Arrays. |

## 📝 Lista de Tareas (Roadmap)

- [x] **TP0:** Configuración básica y Clases POO.
- [x] **TP0:** Relaciones (Universidad -> Carrera -> Materia).
- [ ] **TP1:** Crear clase `Persona` (Herencia).
- [ ] **TP1:** Refactorizar `Estudiante` y `Profesor` para usar `extends`.
- [ ] **TP1:** Implementar Algoritmos de Ordenamiento (BubbleSort).
- [ ] **TP2:** Implementar `ListaEnlazada` (Adiós Arrays fijos).
- [ ] **TP3:** Pilas y Colas.

## 🧠 Notas Teóricas para el Examen
* **¿Por qué array en Universidad?** Porque la cantidad de carreras cambia poco.
* **¿Por qué Lista en Inscripciones?** (A futuro) Porque las inscripciones son dinámicas y varían mucho.