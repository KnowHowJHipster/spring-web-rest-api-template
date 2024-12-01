package com.iqkv.sample.webmvc.dashboard.security;

import java.util.Optional;

import com.iqkv.boot.info.Constants;
import com.iqkv.boot.security.SecurityUtils;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * Implementation of {@link AuditorAware} based on Spring Security.
 */
@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    return Optional.of(SecurityUtils.getCurrentUserLogin().orElse(Constants.SYSTEM));
  }
}
