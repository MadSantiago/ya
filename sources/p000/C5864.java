package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۦۨؒۦ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5864 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: ۥؗ */
    public ArrayList f19367;

    /* JADX INFO: renamed from: ۥۗ */
    public List f19368;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC2758 f19369;

    /* JADX INFO: renamed from: ۦؑ */
    public final HashMap f19370;

    public C5864(AbstractC2758 abstractC2758) {
        super(abstractC2758.f9136);
        this.f19370 = new HashMap();
        this.f19369 = abstractC2758;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f19369.mo283(m9685(windowInsetsAnimation));
        this.f19370.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f19369.mo280(m9685(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f19367;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f19367 = arrayList2;
            this.f19368 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM6664 = AbstractC3769.m6664(list.get(size));
            C0460 c0460M9685 = m9685(windowInsetsAnimationM6664);
            c0460M9685.f1659.mo8770(windowInsetsAnimationM6664.getFraction());
            this.f19367.add(c0460M9685);
        }
        return this.f19369.mo281(C2639.m4953(windowInsets, null), this.f19368).m4955();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C2346 c2346Mo282 = this.f19369.mo282(m9685(windowInsetsAnimation), new C2346(bounds));
        c2346Mo282.getClass();
        AbstractC3769.m6662();
        return AbstractC3769.m6658(((C5364) c2346Mo282.f7786).m9018(), ((C5364) c2346Mo282.f7785).m9018());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0460 m9685(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f19370;
        C0460 c0460 = (C0460) map.get(windowInsetsAnimation);
        if (c0460 != null) {
            return c0460;
        }
        C0460 c0461 = new C0460(0, null, 0L);
        c0461.f1659 = new C5165(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c0461);
        return c0461;
    }
}
