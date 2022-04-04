locals {
  ip_filepath = "ips.json"

  common_tags = {
    Service     = "Trabalho Terraform"
    ManagedBy   = "Terraform"
    Environment = var.environment
    Owner       = "Jonathan Crespo"
  }
}
