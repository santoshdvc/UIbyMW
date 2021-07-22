package com.masterwarchief.uibymw;

import android.graphics.Color;

public class LoadingBars {
    public enum ShapeType {
        TRIANGLE,
        CIRCLE,
        SQUARE,
        RECTANGLE
    }
    public enum AnimationType {
        SIMPLE,
        ROTATE90,
        WAVE,
        BARS
    }
    private static final float DEFAULT_AMPLITUDE_RATIO = 0.1f;
    private static final float DEFAULT_AMPLITUDE_VALUE = 50.0f;
    private static final float DEFAULT_WATER_LEVEL_RATIO = 0.5f;
    private static final float DEFAULT_WAVE_LENGTH_RATIO = 1.0f;
    private static final float DEFAULT_WAVE_SHIFT_RATIO = 0.0f;
    private static final int DEFAULT_WAVE_PROGRESS_VALUE = 50;
    private static final int DEFAULT_WAVE_COLOR = Color.parseColor("#212121");
    private static final int DEFAULT_WAVE_BACKGROUND_COLOR = Color.parseColor("#00000000");
    private static final int DEFAULT_TITLE_COLOR = Color.parseColor("#212121");
    private static final int DEFAULT_STROKE_COLOR = Color.TRANSPARENT;
    private static final float DEFAULT_BORDER_WIDTH = 0;
    private static final float DEFAULT_TITLE_STROKE_WIDTH = 0;
    private static final int DEFAULT_WAVE_SHAPE = ShapeType.CIRCLE.ordinal();
    private static final int DEFAULT_ROUND_RECTANGLE_X_AND_Y = 30;
    private static final float DEFAULT_TITLE_TOP_SIZE = 18.0f;
    private static final float DEFAULT_TITLE_CENTER_SIZE = 22.0f;
    private static final float DEFAULT_TITLE_BOTTOM_SIZE = 18.0f;

    // Properties.
    private int canvasSize;
    private int canvasHeight;
    private int canvasWidth;
    private float amplitude;
    private int loadBgColor;
    private int loadColor;
    private int shapeType;
    private int roundRectangleRadius;
    private String mTopTitle;
    private String centerTitle;
    private String mBottomTitle;
    private float mDefaultWaterLevel;
    private float waterLevelRatio = 1f;
    private float waveShiftRatio = DEFAULT_WAVE_SHIFT_RATIO;
    private int progressValue = DEFAULT_WAVE_PROGRESS_VALUE;
    private boolean mIsRoundRectangle;
}
