# Food Menu - [Backend API] SpringBoot, Postgres

## 💻 Requirements

* You should have [Docker](https://docs.docker.com/engine/install/) installed 
* And [vscode](https://code.visualstudio.com/) if you wanna try [DevContainer](https://code.visualstudio.com/docs/devcontainers/containers) for development

## 🚀 How to install

Clone repo

```bash
git clone <repo_url>
```

Add a new line in /etc/hosts file

```bash
127.0.0.1 host.docker.internal
```
You can use bellow command

```bash
echo "127.0.0.1 host.docker.internal" | sudo tee -a /etc/hosts
```

### Using Docker

To use docker to run and up application use:


```bash
docker compose up -d
```

access http://host.docker.internal:8080/food


### Using DevContainer

To use dev container to development environment:
1. Install Devcontainer [vscode extension]([DevContainer](https://code.visualstudio.com/docs/devcontainers/containers) )
2. Press Ctrl+Shift+P
3. Choose "Dev Containers: Open folder in Container..." and choose the front-end root folder

After eveyrthing is done you can run
```bash
./mvnw clean package
```

and then 

```bash
./mvnw spring-boot:run
```

access http://host.docker.internal:3000


### Using local envionment (without Docker)

Before to start you must have JDK 17 or higher installed.


Install dependencies

```bash
./mvnw clean package
```

and then 

```bash
./mvnw spring-boot:run
```

#### Backend
* Java 17
* SpringBoot
* Maven
* Postgres
* PgAdmin
* FlywayDB

#### Others
* Docker
* DevContainer
* [API Client Lite](https://marketplace.visualstudio.com/items?itemName=KomaKamaki.vscode-api-client-lite) - VSCode plugin

## Contact

Twitter: [@mcostacurta](https://x.com/costa_curta)

Linkedin: [@mcostacurta](https://www.linkedin.com/in/mcostacurta/)


## 📝 License

MIT