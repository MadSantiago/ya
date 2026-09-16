package p000;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦًٙٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4520 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2139 f14934;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14935;

    public /* synthetic */ ViewOnAttachStateChangeListenerC4520(C2139 c2139, int i) {
        this.f14935 = i;
        this.f14934 = c2139;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f14935;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f14935;
        C2139 c2139 = this.f14934;
        switch (i) {
            case 0:
                AbstractC4009.m7177(c2139);
                view.removeOnAttachStateChangeListener(this);
                view.setTag(R.id.markwon_drawables_scheduler, null);
                break;
            default:
                CharSequence text = c2139.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4965.class);
                if (spans != null && spans.length > 0) {
                    for (Object obj : spans) {
                        ((C4965) obj).f16422 = null;
                    }
                }
                c2139.removeOnAttachStateChangeListener(this);
                c2139.setTag(R.id.markwon_tables_scheduler, null);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m7838(View view) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m7839(View view) {
    }
}
