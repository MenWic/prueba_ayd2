# PUNTO 1:
# --------
# Cargar la librería ggplot2
library(ggplot2)
# Ejecutar ggplot con el dataset mpg
ggplot(data = mpg)


# PUNTO 2:
# --------
# Ver dimensiones del dataset mpg
dim(mpg)
# Alternativamente
nrow(mpg) # Número de filas
ncol(mpg) # Número de columnas

# PUNTO 3:
# --------
# Ver las primeras filas del dataset
head(mpg)
# Obtener la descripción de drv
?mpg

# PUNTO 4:
# --------
ggplot(data = mpg, aes(x = cyl, y = hwy)) +
  geom_point() +
  labs(title = "Relación entre cilindros y consumo en carretera",
       x = "Número de cilindros",
       y = "Millas por galón en carretera")


# PUNTO 5:
# --------
ggplot(data = mpg, aes(x = class, y = drv)) +
  geom_point() +
  labs(title = "Tipo de vehículo vs Tipo de tracción",
       x = "Clase de vehículo",
       y = "Tipo de tracción")
# ---
ggplot(data = mpg, aes(x = class, fill = drv)) +
  geom_bar() +
  labs(title = "Distribución de tracción según el tipo de vehículo",
       x = "Clase de vehículo",
       y = "Cantidad de autos")

