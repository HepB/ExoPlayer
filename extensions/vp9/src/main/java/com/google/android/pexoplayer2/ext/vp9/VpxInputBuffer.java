/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.pexoplayer2.ext.vp9;

import com.google.android.pexoplayer2.decoder.DecoderInputBuffer;
import com.google.android.pexoplayer2.video.ColorInfo;

/**
 * Input buffer to a {@link VpxDecoder}.
 */
/* package */ final class VpxInputBuffer extends DecoderInputBuffer {

  public ColorInfo colorInfo;

  public VpxInputBuffer() {
    super(DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DIRECT);
  }

}