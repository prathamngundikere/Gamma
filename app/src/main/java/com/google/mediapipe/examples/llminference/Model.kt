package com.google.mediapipe.examples.llminference

// NB: Make sure the filename is *unique* per model you use!
// Weight caching is currently based on filename alone.
enum class Model(val path: String) {
    GEMMA_CPU_8bit("/data/local/tmp/llm/gemma2-2b-it-cpu-int8.task"),
    GEMMA_GPU_8bit("/data/local/tmp/llm/gemma2-2b-it-gpu-int8.bin"),
    GEMMA_CPU_4bit("/data/local/tmp/llm/gemma-2b-it-cpu-int4.bin"),
    GEMMA_GPU_4bit("/data/local/tmp/llm/gemma-2b-it-gpu-int4.bin")
}
