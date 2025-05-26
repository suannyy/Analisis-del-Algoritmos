
# 📊 Análisis de Algoritmos

## 📌 Definición

El **análisis de algoritmos** es una rama de la informática que se encarga de estudiar el rendimiento de los algoritmos, particularmente su eficiencia en cuanto a tiempo de ejecución y uso de recursos (como memoria). Permite predecir el comportamiento de los algoritmos a medida que aumenta el tamaño de entrada.

---

## 🧠 Objetivos

- Evaluar la **eficiencia temporal** y **espacial**.
- Determinar el comportamiento en el **peor caso**, **mejor caso**, y **caso promedio**.
- Comparar algoritmos que resuelven el mismo problema.
- Ayudar a elegir la mejor solución para un problema particular.

---

## ⚙️ Tipos de análisis

### ⏱️ Tiempo de ejecución

Medida de cuántas operaciones realiza un algoritmo según el tamaño de la entrada.

- **O(1):** constante
- **O(log n):** logarítmico
- **O(n):** lineal
- **O(n log n):** log-lineal
- **O(n²):** cuadrático
- **O(2ⁿ):** exponencial

### 💾 Complejidad espacial

Cantidad de memoria adicional que necesita un algoritmo para ejecutarse.

---

## 🔁 Algoritmia y estructura

Un **algoritmo** es una secuencia finita de pasos lógicos bien definidos que resuelven un problema. Sus propiedades incluyen:

- **Entrada**
- **Salida**
- **Definición precisa**
- **Finitud**
- **Eficiencia**

La **algorítmica** estudia cómo construir y mejorar algoritmos, utilizando técnicas como:

- Divide y vencerás
- Programación dinámica
- Greedy (voraz)
- Backtracking
- Ramificación y poda

---

## 📌 Ejemplo: Búsqueda binaria

```python
def busqueda_binaria(arr, x):
    inicio, fin = 0, len(arr) - 1
    while inicio <= fin:
        mid = (inicio + fin) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            inicio = mid + 1
        else:
            fin = mid - 1
    return -1
```

### Complejidad:
- **Tiempo (mejor caso):** O(1)
- **Tiempo (peor caso):** O(log n)
- **Espacio:** O(1)

---

## 📐 Herramientas para el análisis

- **Notación Big-O:** comportamiento en el peor caso.
- **Notación Omega (Ω):** mejor caso.
- **Notación Theta (Θ):** comportamiento promedio/ajustado.

---

