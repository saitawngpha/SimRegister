package jp.co.recruit_lifestyle.android.widget.character;

/**
 * Created by Sai Pha on 1/21/2017.
 */

import android.graphics.Path;

public class SimPath {

    public static Path getHogePath(float width, float[] centerPoint){
        Path path = new Path();

        path.moveTo(centerPoint[0]  - width / 2 + 0.125f * width, centerPoint[1] - width / 2 + 0.433f * width);
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.125f * width, centerPoint[1] - width / 2 + 0.433f * width,
                centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.208f * width,
                centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.208f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.606f * width, centerPoint[1] - width / 2 + 0.208f * width,
                centerPoint[0]  - width / 2 + 0.619f * width, centerPoint[1] - width / 2 + 0.207f * width,
                centerPoint[0]  - width / 2 + 0.619f * width, centerPoint[1] - width / 2 + 0.207f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.619f * width, centerPoint[1] - width / 2 + 0.207f * width,
                centerPoint[0]  - width / 2 + 0.638f * width, centerPoint[1] - width / 2 + 0.212f * width,
                centerPoint[0]  - width / 2 + 0.638f * width, centerPoint[1] - width / 2 + 0.212f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.638f * width, centerPoint[1] - width / 2 + 0.212f * width,
                centerPoint[0]  - width / 2 + 0.658f * width, centerPoint[1] - width / 2 + 0.255f * width,
                centerPoint[0]  - width / 2 + 0.658f * width, centerPoint[1] - width / 2 + 0.255f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.658f * width, centerPoint[1] - width / 2 + 0.255f * width,
                centerPoint[0]  - width / 2 + 0.753f * width, centerPoint[1] - width / 2 + 0.456f * width,
                centerPoint[0]  - width / 2 + 0.753f * width, centerPoint[1] - width / 2 + 0.456f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.753f * width, centerPoint[1] - width / 2 + 0.456f * width,
                centerPoint[0]  - width / 2 + 0.721f * width, centerPoint[1] - width / 2 + 0.55f * width,
                centerPoint[0]  - width / 2 + 0.721f * width, centerPoint[1] - width / 2 + 0.55f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.721f * width, centerPoint[1] - width / 2 + 0.55f * width,
                centerPoint[0]  - width / 2 + 0.272f * width, centerPoint[1] - width / 2 + 0.761f * width,
                centerPoint[0]  - width / 2 + 0.272f * width, centerPoint[1] - width / 2 + 0.761f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.26f * width, centerPoint[1] - width / 2 + 0.76f * width,
                centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.751f * width,
                centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.751f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.272f * width, centerPoint[1] - width / 2 + 0.761f * width,
                centerPoint[0]  - width / 2 + 0.26f * width, centerPoint[1] - width / 2 + 0.76f * width,
                centerPoint[0]  - width / 2 + 0.26f * width, centerPoint[1] - width / 2 + 0.76f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.25f * width, centerPoint[1] - width / 2 + 0.751f * width,
                centerPoint[0]  - width / 2 + 0.117f * width, centerPoint[1] - width / 2 + 0.469f * width,
                centerPoint[0]  - width / 2 + 0.117f * width, centerPoint[1] - width / 2 + 0.469f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.117f * width, centerPoint[1] - width / 2 + 0.469f * width,
                centerPoint[0]  - width / 2 + 0.115f * width, centerPoint[1] - width / 2 + 0.455f * width,
                centerPoint[0]  - width / 2 + 0.115f * width, centerPoint[1] - width / 2 + 0.455f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.115f * width, centerPoint[1] - width / 2 + 0.455f * width,
                centerPoint[0]  - width / 2 + 0.125f * width, centerPoint[1] - width / 2 + 0.433f * width,
                centerPoint[0]  - width / 2 + 0.125f * width, centerPoint[1] - width / 2 + 0.433f * width
        );

        path.moveTo(centerPoint[0]  - width / 2 + 0.192f * width, centerPoint[1] - width / 2 + 0.457f * width);
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.192f * width, centerPoint[1] - width / 2 + 0.457f * width,
                centerPoint[0]  - width / 2 + 0.395f * width, centerPoint[1] - width / 2 + 0.361f * width,
                centerPoint[0]  - width / 2 + 0.395f * width, centerPoint[1] - width / 2 + 0.361f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.395f * width, centerPoint[1] - width / 2 + 0.361f * width,
                centerPoint[0]  - width / 2 + 0.418f * width, centerPoint[1] - width / 2 + 0.359f * width,
                centerPoint[0]  - width / 2 + 0.418f * width, centerPoint[1] - width / 2 + 0.359f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.418f * width, centerPoint[1] - width / 2 + 0.359f * width,
                centerPoint[0]  - width / 2 + 0.437f * width, centerPoint[1] - width / 2 + 0.373f * width,
                centerPoint[0]  - width / 2 + 0.437f * width, centerPoint[1] - width / 2 + 0.373f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.437f * width, centerPoint[1] - width / 2 + 0.373f * width,
                centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.561f * width,
                centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.561f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.525f * width, centerPoint[1] - width / 2 + 0.561f * width,
                centerPoint[0]  - width / 2 + 0.532f * width, centerPoint[1] - width / 2 + 0.581f * width,
                centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.601f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.513f * width, centerPoint[1] - width / 2 + 0.601f * width,
                centerPoint[0]  - width / 2 + 0.306f * width, centerPoint[1] - width / 2 + 0.699f * width,
                centerPoint[0]  - width / 2 + 0.306f * width, centerPoint[1] - width / 2 + 0.699f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.306f * width, centerPoint[1] - width / 2 + 0.699f * width,
                centerPoint[0]  - width / 2 + 0.284f * width, centerPoint[1] - width / 2 + 0.714f * width,
                centerPoint[0]  - width / 2 + 0.263f * width, centerPoint[1] - width / 2 + 0.684f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.263f * width, centerPoint[1] - width / 2 + 0.684f * width,
                centerPoint[0]  - width / 2 + 0.176f * width, centerPoint[1] - width / 2 + 0.499f * width,
                centerPoint[0]  - width / 2 + 0.176f * width, centerPoint[1] - width / 2 + 0.499f * width
        );
        path.cubicTo(
                centerPoint[0]  - width / 2 + 0.176f * width, centerPoint[1] - width / 2 + 0.499f * width,
                centerPoint[0]  - width / 2 + 0.172f * width, centerPoint[1] - width / 2 + 0.466f * width,
                centerPoint[0]  - width / 2 + 0.192f * width, centerPoint[1] - width / 2 + 0.457f * width
        );
        return path;

    }
}
