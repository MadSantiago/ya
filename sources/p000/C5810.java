package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦِۧؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5810 extends RatingBar {

    /* JADX INFO: renamed from: ۦۨ */
    public final C5002 f19134;

    public C5810(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC5216.m8834(this, getContext());
        C5002 c5002 = new C5002((AbsSeekBar) this);
        this.f19134 = c5002;
        c5002.mo5327(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f19134.f16550;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
