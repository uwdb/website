---
layout: page
title: "AWS Best Practices"
group: "navigation"
id: "aws"
---

# AWS Best Practices

This page contains resources for securing AWS resources.

## Authentication

A compromised password can result in tens of thousands of dollars in damage.  Please use a unique, sufficiently complex password for your AWS account.  Even better, consider using a [secure password manager](https://keepass.info) to store your credential.

Enable two-factor authentication for your accounts.  Unless you already have a physical token, it's easiest to enable 2FA using a virtual device such as [Google Authenticator](https://play.google.com/store/apps/details?id=com.google.android.apps.authenticator2).  Instructions for enabling a device under AWS are [located here](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_enable_virtual.html).

## S3 Buckets

Unless absolutely necessary, no S3 buckets should be publicly-available.  The [S3 console](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/bucket-permissions-check.html) shows a list of all public buckets; periodically review this list for any buckets that might unnecessarily expose data.

If you do need to make a S3 bucket widely available, consider requiring that the requesting user [pay the transfer costs](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).

There are also some [decent tools](https://github.com/kromtech/s3-inspector) that can be used to automate this process.  If you find a good one, please update this page.

## EC2 Instances

The default security group for EC2 instances is permissive, and allows external connections to any port.  For defense in depth, [modify this group](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html) to allow inbound TCP port 22 (SSH) traffic only from the University of Washington subnet (205.175.0.0/16, maybe?).  If you need to connect from off campus, first connect to the [university VPN](https://www.aa.washington.edu/students/computing/vpn) and then SSH as normal.

## Credential Rotation

Everyone leaves their API keys lying around in cleartext.  Some people accidentally check them into GitHub.  To reduce the risk of unauthorized use, periodically invalidate your API keys and regenerate new ones.

## Billing Alerts

Using this script, set up [billing alarms](https://cloudmaven.github.io/documentation/aws_cost_notification_system.html) that automatically send out expenditure reports to faculty demigods.  This way if your account is compromised we can detect an issue as soon as possible.

## Contact Information

Periodically review your contact information to ensure that, should AWS attempt contact, you will receive the notification.  Confirm that AWS emails do not go into your spam folder.  When graduating, deactivate your account.  If you forget, ninjas may unexpectedly repossess your diploma.
