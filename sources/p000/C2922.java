package p000;

import android.text.SpannableStringBuilder;
import java.util.HashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۨؔۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2922 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final HashMap f9822 = new HashMap(2);

    /* JADX INFO: renamed from: ۥۣ */
    public final C2842 f9823;

    public C2922(C4228 c4228, C1199 c1199) {
        this.f9823 = new C2842(c4228, c1199);
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3264(C3571 c3571) {
        c3571.f11830 = this.f9823;
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3265(C2139 c2139) {
        Integer num = (Integer) c2139.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode);
        int iHashCode = c2139.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            c2139.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(iHashCode));
            C4478[] c4478ArrM7187 = AbstractC4009.m7187(c2139);
            if (c4478ArrM7187 == null || c4478ArrM7187.length <= 0) {
                return;
            }
            int i = 0;
            if (c2139.getTag(R.id.markwon_drawables_scheduler) == null) {
                ViewOnAttachStateChangeListenerC4520 viewOnAttachStateChangeListenerC4520 = new ViewOnAttachStateChangeListenerC4520(c2139, i);
                c2139.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4520);
                c2139.setTag(R.id.markwon_drawables_scheduler, viewOnAttachStateChangeListenerC4520);
            }
            RunnableC3365 runnableC3365 = new RunnableC3365(1, c2139);
            int length = c4478ArrM7187.length;
            while (i < length) {
                C0838 c0838 = c4478ArrM7187[i].f14785;
                c0838.m1747(new C5513(c2139, runnableC3365, c0838.getBounds()));
                i++;
            }
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3528(C5008 c5008) {
        c5008.m8422(C5141.class, new C1635(5));
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3266(C2139 c2139, SpannableStringBuilder spannableStringBuilder) {
        AbstractC4009.m7177(c2139);
    }
}
