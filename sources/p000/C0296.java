package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؓؑؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0296 extends SeekBar {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2806 f1086;

    public C0296(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC5216.m8834(this, getContext());
        C2806 c2806 = new C2806(this);
        this.f1086 = c2806;
        c2806.mo5327(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2806 c2806 = this.f1086;
        C0296 c0296 = c2806.f9362;
        Drawable drawable = c2806.f9366;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0296.getDrawableState())) {
            c0296.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1086.f9366;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1086.m5329(canvas);
    }
}
