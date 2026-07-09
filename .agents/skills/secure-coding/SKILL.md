---
name: secure-coding
description: Apply secure coding practices to Java code, focusing on input validation, safe error handling, dependency awareness, and avoiding insecure patterns.
---

When editing Java code:

- Validate all external inputs.
- Fail fast with clear but non-sensitive error messages.
- Do not expose stack traces, secrets, tokens, credentials, internal paths, or implementation details.
- Prefer explicit allowlists over blocklists.
- Avoid string-based command execution.
- Avoid unsafe deserialisation.
- Avoid hardcoded secrets.
- Avoid logging sensitive data.
- Use standard library security features where possible.
- Keep changes minimal and focused.
- Do not change unrelated code.

When generating tests:

- Cover invalid input.
- Cover boundary cases.
- Cover abuse cases where relevant.
- Verify that sensitive details are not exposed in exception messages or logs.