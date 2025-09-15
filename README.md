# Exercicis de Tractament d'Excepcions en Java

## Nivell 1

### Exercici 1

Crea una classe anomenada `Producte` amb els atributs `nom` i `preu`, i una altra classe anomenada `Venda`.  
Aquesta classe té com a atributs:

- Una col·lecció de productes
- El preu total de la venda

La classe `Venda` ha de tenir un mètode anomenat `calcularTotal()` que:

- Llença l’excepció personalitzada `VendaBuidaException`
- Mostra per pantalla:  
si la col·lecció de productes està buida.
- Si la col·lecció té productes:
- Recorre la col·lecció
- Guarda la suma de tots els preus dels productes a l’atribut `preuTotal` de la venda.

#### Excepció Personalitzada
La classe `VendaBuidaException` ha de ser filla de la classe `Exception`.  
Al seu constructor li hem de passar el missatge:
Quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode `getMessage()`.

#### Altres
Escriu el codi necessari per a **generar i capturar** una excepció de tipus `IndexOutOfBoundsException`.

---

## Nivell 2

### Exercici 1

Crea una classe anomenada `Entrada`. Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe `Scanner`.

#### Requisits

- Instancia un objecte de la classe `Scanner`.
- Crea **mètodes estàtics** per llegir diferents tipus de dades des del teclat.
- Si en algun mètode salta una excepció:
  - Tracta-la.
  - Torna a demanar la dada fins que estigui ben introduïda.
  - Per exemple:
    - Si introdueix un float amb un punt en lloc d'una coma, ha de mostrar:
      ```
      Error de format
      ```
      i tornar a demanar el valor fins que sigui correcte.

Tots els mètodes reben un `String` amb el missatge a mostrar a l’usuari,  
per exemple: `"Introdueix la teva edat"`  
i retornen la dada introduïda (ex: un `byte` amb l’edat de l’usuari).

#### Mètodes a implementar

Capturant l’excepció `InputMismatchException`:

```java
public static byte llegirByte(String missatge);

public static int llegirInt(String missatge);

public static float llegirFloat(String missatge);

public static double llegirDouble(String missatge);
