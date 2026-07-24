# Week 7 – DevOps, Cloud & Generative AI Notes

## Overview

Week 7 introduced modern software delivery practices and emerging technologies that support scalable application development. The focus was on DevOps principles, Continuous Integration and Continuous Deployment (CI/CD), Docker containers, Cloud Computing fundamentals, and the basics of Generative AI.

---

# 1. DevOps

## What is DevOps?

DevOps is a software development methodology that combines **Development (Dev)** and **Operations (Ops)** to improve collaboration, automate workflows, and deliver software faster with higher quality.

### Objectives
- Faster software delivery
- Better collaboration between teams
- Automated testing and deployment
- Continuous monitoring
- Improved software reliability

### DevOps Lifecycle

1. Plan
2. Develop
3. Build
4. Test
5. Release
6. Deploy
7. Operate
8. Monitor

### Benefits

- Faster releases
- Reduced manual work
- Improved collaboration
- Better software quality
- Continuous feedback
- Increased productivity

---

# 2. CI/CD

## Continuous Integration (CI)

Continuous Integration is the practice of automatically integrating code changes into a shared repository several times a day.

### CI Workflow

- Developer writes code
- Pushes code to GitHub
- Build is triggered automatically
- Automated tests are executed
- If tests pass, the build is successful

### Advantages

- Detects bugs early
- Faster development
- Better code quality
- Easier collaboration

---

## Continuous Delivery (CD)

Continuous Delivery ensures that software is always ready for deployment.

### Features

- Automated testing
- Automated packaging
- Release-ready applications
- Faster deployment

---

## Continuous Deployment

Every successful build is automatically deployed to production without manual intervention.

---

# 3. Docker

## What is Docker?

Docker is an open-source platform that packages applications and their dependencies into lightweight containers.

### Why Docker?

- Runs consistently across environments
- Easy deployment
- Lightweight
- Faster startup than virtual machines
- Simplifies application management

---

## Docker Components

### Docker Image

A read-only template containing the application and all required dependencies.

### Docker Container

A running instance of a Docker image.

### Dockerfile

A script containing instructions to build a Docker image.

### Docker Hub

An online repository for storing and sharing Docker images.

---

## Basic Docker Commands

```bash
docker --version
docker pull <image>
docker images
docker run <image>
docker ps
docker stop <container-id>
docker rm <container-id>
docker build -t app .
```

---

# 4. Cloud Computing

## What is Cloud Computing?

Cloud Computing provides computing resources such as servers, storage, databases, and networking over the Internet.

### Advantages

- Pay only for what you use
- High availability
- Easy scalability
- Data backup
- Global accessibility

---

## Cloud Service Models

### IaaS (Infrastructure as a Service)

Provides virtual machines, networking, and storage.

Examples:
- AWS EC2
- Microsoft Azure VM
- Google Compute Engine

---

### PaaS (Platform as a Service)

Provides a platform to develop and deploy applications.

Examples:
- Google App Engine
- Azure App Service
- Heroku

---

### SaaS (Software as a Service)

Provides software over the Internet.

Examples:
- Gmail
- Microsoft 365
- Google Docs

---

## Deployment Models

### Public Cloud
Resources are owned by cloud providers.

### Private Cloud
Infrastructure is dedicated to one organization.

### Hybrid Cloud
Combination of public and private cloud environments.

---

# 5. Cloud Providers

## Amazon Web Services (AWS)

Popular Services:
- EC2
- S3
- RDS
- Lambda
- IAM

---

## Microsoft Azure

Popular Services:
- Azure Virtual Machines
- Azure Storage
- Azure SQL Database
- Azure App Service

---

## Google Cloud Platform (GCP)

Popular Services:
- Compute Engine
- Cloud Storage
- BigQuery
- Cloud Functions

---

# 6. Generative AI

## What is Generative AI?

Generative AI is a type of Artificial Intelligence that creates new content such as text, images, code, audio, and videos using machine learning models.

---

## Applications

- Chatbots
- Code generation
- Content writing
- Image generation
- Video creation
- Translation
- Document summarization

---

## Popular Generative AI Tools

- ChatGPT
- GitHub Copilot
- Google Gemini
- Microsoft Copilot
- Claude
- Midjourney
- DALL·E

---

## Benefits

- Increases productivity
- Saves development time
- Automates repetitive tasks
- Improves customer support
- Helps generate code and documentation

---

## Limitations

- May generate incorrect information
- Requires human verification
- Privacy concerns
- Can inherit biases from training data
- Depends on quality of prompts

---

# 7. GitHub in DevOps

GitHub is commonly used in DevOps workflows to:

- Store source code
- Track changes
- Collaborate using branches
- Manage pull requests
- Trigger CI/CD pipelines
- Integrate with deployment tools

---

# 8. Key Takeaways

- Learned DevOps principles and lifecycle.
- Understood Continuous Integration and Continuous Deployment.
- Explored Docker containers and essential Docker commands.
- Learned Cloud Computing concepts and service models (IaaS, PaaS, SaaS).
- Studied AWS, Azure, and GCP fundamentals.
- Gained an introduction to Generative AI, its applications, benefits, and limitations.
- Understood how GitHub supports DevOps workflows and automation.

---

# Conclusion

Week 7 focused on modern software development practices by introducing DevOps, CI/CD, Docker, Cloud Computing, and Generative AI. These concepts provide the foundation for building, deploying, and maintaining scalable applications while leveraging automation and AI-powered tools to improve software development efficiency.