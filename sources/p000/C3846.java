package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: ۦَؔۥۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3846 extends ContentFrameLayout {

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f12860;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3846(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852, C5260 c5260) {
        super(c5260);
        this.f12860 = layoutInflaterFactory2C1852;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f12860.m3661(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f12860;
                layoutInflaterFactory2C1852.m3644(layoutInflaterFactory2C1852.m3641(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC4225.m7464(getContext(), i));
    }
}
