package p000;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٚؑۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1707 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f5677;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5678 = 1;

    public C1707(C2268 c2268) {
        this.f5677 = new C1829(c2268);
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥؗ */
    public void mo3527() {
        switch (this.f5678) {
            case 0:
                C1829 c1829 = (C1829) this.f5677;
                c1829.f6064 = null;
                c1829.f6063 = false;
                c1829.f6062 = 0;
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3265(C2139 c2139) {
        switch (this.f5678) {
            case 0:
                CharSequence text = c2139.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4965.class);
                if (spans != null && spans.length > 0) {
                    if (c2139.getTag(R.id.markwon_tables_scheduler) == null) {
                        ViewOnAttachStateChangeListenerC4520 viewOnAttachStateChangeListenerC4520 = new ViewOnAttachStateChangeListenerC4520(c2139, 1);
                        c2139.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4520);
                        c2139.setTag(R.id.markwon_tables_scheduler, viewOnAttachStateChangeListenerC4520);
                    }
                    C2346 c2346 = new C2346(c2139);
                    for (Object obj : spans) {
                        ((C4965) obj).f16422 = c2346;
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۜ */
    public void mo3528(C5008 c5008) {
        switch (this.f5678) {
            case 1:
                c5008.m8422(C0986.class, new C4032((C1571) this.f5677));
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦؑ */
    public void mo3266(C2139 c2139, SpannableStringBuilder spannableStringBuilder) {
        switch (this.f5678) {
            case 0:
                CharSequence text = c2139.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4965.class);
                if (spans != null && spans.length > 0) {
                    for (Object obj : spans) {
                        ((C4965) obj).f16422 = null;
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3529(C5008 c5008) {
        switch (this.f5678) {
            case 0:
                C1829 c1829 = (C1829) this.f5677;
                c5008.m8424(C3702.class, new C4172(17));
                c5008.m8424(C4963.class, new C0957(c1829, 3));
                c5008.m8424(C5861.class, new C0957(c1829, 2));
                c5008.m8424(C0312.class, new C0957(c1829, 1));
                c5008.m8424(C0662.class, new C0957(c1829, 0));
                break;
            default:
                c5008.m8424(C0986.class, new C4172(18));
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3530(C1489 c1489) {
        switch (this.f5678) {
            case 0:
                c1489.m3167(Collections.singleton(new C5353(2)));
                break;
            default:
                ((ArrayList) c1489.f5058).add(new C3172());
                break;
        }
    }

    public C1707(C1571 c1571) {
        this.f5677 = c1571;
    }
}
