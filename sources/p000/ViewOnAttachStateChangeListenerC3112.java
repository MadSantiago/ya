package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ۦؘؒؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3112 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f10435;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ View f10436;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10437;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3112(View view, Object obj, int i) {
        this.f10437 = i;
        this.f10436 = view;
        this.f10435 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f10437) {
            case 0:
                ((ViewGroup) this.f10436).addView((C5257) this.f10435, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f10437;
        Object obj = this.f10435;
        View view2 = this.f10436;
        switch (i) {
            case 0:
                ((ViewGroup) view2).addView((C5257) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                ((C0469) obj).m1010();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m5695(View view) {
    }
}
