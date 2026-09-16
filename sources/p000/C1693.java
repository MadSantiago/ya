package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: ۥۣٙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1693 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5653;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f5653) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (!(view instanceof C3052) || (outline2 = ((C3052) view).f10279) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                if (view != null) {
                    throw new ClassCastException();
                }
                view.getClass();
                throw new ClassCastException();
        }
    }
}
