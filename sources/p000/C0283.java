package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؘؚؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0283 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ۥؓ */
    public float f1031;

    /* JADX INFO: renamed from: ۥؖ */
    public float f1032;

    /* JADX INFO: renamed from: ۥً */
    public long f1033;

    /* JADX INFO: renamed from: ۥْ */
    public final int f1035;

    /* JADX INFO: renamed from: ۥٕ */
    public Picture f1037;

    /* JADX INFO: renamed from: ۥۖ */
    public Bitmap f1040;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f1042;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f1043;

    /* JADX INFO: renamed from: ۦٚ */
    public long f1046;

    /* JADX INFO: renamed from: ۦۛ */
    public Canvas f1047;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Bitmap.Config f1048;

    /* JADX INFO: renamed from: ۦۨ */
    public final Movie f1049;

    /* JADX INFO: renamed from: ۥٓ */
    public final Paint f1036 = new Paint(3);

    /* JADX INFO: renamed from: ۥَ */
    public final ArrayList f1034 = new ArrayList();

    /* JADX INFO: renamed from: ۥٖ */
    public final Rect f1038 = new Rect();

    /* JADX INFO: renamed from: ۦٗ */
    public final Rect f1045 = new Rect();

    /* JADX INFO: renamed from: ۦٕ */
    public float f1044 = 1.0f;

    /* JADX INFO: renamed from: ۥٙ */
    public float f1039 = 1.0f;

    /* JADX INFO: renamed from: ۥۙ */
    public int f1041 = 1;

    public C0283(Movie movie, Bitmap.Config config, int i) {
        this.f1049 = movie;
        this.f1048 = config;
        this.f1035 = i;
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        C1078.m2272("Bitmap config must not be hardware.");
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        boolean z;
        Movie movie = this.f1049;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            z = false;
            i = 0;
        } else {
            if (this.f1042) {
                this.f1046 = SystemClock.uptimeMillis();
            }
            int i2 = (int) (this.f1046 - this.f1033);
            i = i2 - ((i2 / iDuration) * iDuration);
            z = true;
        }
        movie.setTime(i);
        if (this.f1043) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f1045;
            rect.set(0, 0, width, height);
            m606(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.f1044;
                canvas.scale(f, f);
                m607(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            m606(getBounds());
            m607(canvas);
        }
        if (this.f1042 && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1049.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1049.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f1036.getAlpha() != 255) {
            return -3;
        }
        int i = this.f1041;
        if (i != 3) {
            return (i == 1 && this.f1049.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1042;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            C1078.m2273(AbstractC5078.m8670(i, "Invalid alpha: "));
        } else {
            this.f1036.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1036.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f1042) {
            return;
        }
        this.f1042 = true;
        this.f1033 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f1034;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2165) arrayList.get(i)).m4218(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f1042) {
            this.f1042 = false;
            ArrayList arrayList = this.f1034;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C2165) arrayList.get(i)).m4219(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m606(Rect rect) {
        Rect rect2 = this.f1038;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f1049;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        int i = this.f1035;
        double dM5783 = C3133.m5783(iWidth2, iHeight2, iWidth, iHeight, i);
        if (!this.f1043 && dM5783 > 1.0d) {
            dM5783 = 1.0d;
        }
        float f = (float) dM5783;
        this.f1044 = f;
        int i2 = (int) (iWidth2 * f);
        int i3 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, this.f1048);
        Bitmap bitmap = this.f1040;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f1040 = bitmapCreateBitmap;
        this.f1047 = new Canvas(bitmapCreateBitmap);
        if (this.f1043) {
            this.f1039 = 1.0f;
            this.f1032 = 0.0f;
            this.f1031 = 0.0f;
        } else {
            float fM5783 = (float) C3133.m5783(i2, i3, iWidth, iHeight, i);
            this.f1039 = fM5783;
            this.f1032 = ((iWidth - (i2 * fM5783)) / 2.0f) + rect.left;
            this.f1031 = ((iHeight - (fM5783 * i3)) / 2.0f) + rect.top;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m607(Canvas canvas) {
        Paint paint = this.f1036;
        Canvas canvas2 = this.f1047;
        Bitmap bitmap = this.f1040;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f1044;
            canvas2.scale(f, f);
            this.f1049.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f1037;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f1032, this.f1031);
                float f2 = this.f1039;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }
}
