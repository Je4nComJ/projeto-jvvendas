# Usar a imagem base do JDK 21
FROM openjdk:21-jdk AS build

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar todos os arquivos do diretório atual para o diretório de trabalho no contêiner
COPY . .

# Montar o cache do repositório Maven e executar o Maven
RUN --mount=type=cache,id=s/2d452bfe-839d-4e66-994d-6c415e3bfdfc-m2/repository,target=/root/.m2/repository \
    chmod +x ./mvnw && ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean dependency:list install
