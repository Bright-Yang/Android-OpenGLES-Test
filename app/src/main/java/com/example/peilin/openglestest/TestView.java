package com.example.peilin.openglestest;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class TestView extends GLSurfaceView {

    private final TestRenderer mRenderer;

    public TestView(Context context) {
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new TestRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);

        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
