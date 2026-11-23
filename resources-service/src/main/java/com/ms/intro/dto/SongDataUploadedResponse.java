package com.ms.intro.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SongDataUploadedResponse(Integer id) {
}
