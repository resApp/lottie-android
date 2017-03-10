package com.airbnb.lottie;

import android.graphics.Canvas;
import android.graphics.Matrix;

interface DrawingContent {
  void draw(Canvas canvas, Matrix parentMatrix, int alpha);
}
