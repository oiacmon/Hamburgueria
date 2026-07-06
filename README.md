# 📘 **Sistema de Hamburgueria (Java + Padrões de Projeto)**

## 🍔 Visão Geral

Este projeto implementa uma hamburgueria completa utilizando **Java** e **padrões de projeto**.  
A aplicação demonstra uma arquitetura modular, escalável e orientada a objetos, cobrindo:

- criação de pedidos
- montagem de hambúrgueres
- aplicação de extras
- cálculo de preço
- controle de estado
- notificações
- preparação do hambúrguer
- persistência
- pagamento
- execução via CLI

---

# 🏛️ Arquitetura

A arquitetura segue uma divisão clara em camadas:

```
domain/        → regras de negócio + padrões de projeto  
application/   → serviços + fachada  
infrastructure/→ persistência + pagamento  
presentation/  → CLI + controllers  
```

---

# 🧩 Padrões de Projeto Implementados

### **Criação**
- Builder
- Prototype
- Factory Method
- Abstract Factory

### **Estruturais**
- Decorator
- Facade
- Adapter

### **Comportamentais**
- Strategy
- State
- Observer
- Template Method

---

# 📂 Estrutura de Pastas

```
src/
 ├── main/java/com/hamburgueria/
 │   ├── domain/
 │   │   ├── entities/
 │   │   ├── builder/
 │   │   ├── decorator/
 │   │   ├── factory/
 │   │   │   ├── method/
 │   │   │   └── abstractfactory/
 │   │   ├── observer/
 │   │   ├── prototype/
 │   │   ├── state/
 │   │   ├── strategy/
 │   │   └── template/
 │   ├── application/
 │   │   ├── facade/
 │   │   └── services/
 │   ├── infrastructure/
 │   │   ├── persistence/
 │   │   └── payment/
 │   └── presentation/
 │       ├── MainCLI.java
 │       └── PedidoController.java
 └── test/java/com/hamburgueria/
     ├── builder/
     ├── decorator/
     ├── strategy/
     ├── state/
     ├── observer/
     └── facade/
```

---

# ▶️ Execução

O projeto está configurado no `pom.xml` para rodar via `exec-maven-plugin`.

### **Para executar a aplicação:**

```
mvn clean compile exec:java
```

Isso executa automaticamente:

```
com.hamburgueria.presentation.MainCLI
```

---

# 🧪 Testes

Para rodar todos os testes unitários:

```
mvn test
```

---

# 🎯 Fluxo da Aplicação

1. Cliente é criado
2. Pedido é criado
3. Observers são registrados
4. Hambúrguer é montado (Builder + Abstract Factory)
5. Extras são aplicados (Decorator)
6. Preço é calculado (Strategy)
7. Hambúrguer é preparado (Template Method)
8. Pedido avança de estado (State)
9. Observers são notificados (Observer)
10. Tudo é orquestrado pela Facade

---