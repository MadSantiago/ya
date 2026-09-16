package p000;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۦِؓٞۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3959 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f13232;

    /* JADX INFO: renamed from: ۥُ */
    public Object f13233;

    /* JADX INFO: renamed from: ۥّ */
    public Object f13234;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f13235;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f13236;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f13237;

    public AbstractC3959(Context context, C1489 c1489) {
        this.f13236 = 0;
        this.f13235 = c1489;
        this.f13232 = context.getApplicationContext();
        this.f13237 = new Object();
        this.f13234 = new LinkedHashSet();
    }

    public String toString() {
        switch (this.f13236) {
            case 1:
                return getClass().getSimpleName() + "{" + mo3184() + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC3959 mo7112() {
        return (AbstractC3959) this.f13235;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract Object mo757();

    /* JADX INFO: renamed from: ۥّ */
    public void mo7113(AbstractC3959 abstractC3959) {
        this.f13235 = abstractC3959;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m7114(AbstractC3959 abstractC3959) {
        abstractC3959.m7116();
        abstractC3959.mo7113(this);
        AbstractC3959 abstractC39510 = (AbstractC3959) this.f13237;
        if (abstractC39510 == null) {
            this.f13232 = abstractC3959;
            this.f13237 = abstractC3959;
        } else {
            abstractC39510.f13234 = abstractC3959;
            abstractC3959.f13233 = abstractC39510;
            this.f13237 = abstractC3959;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public abstract void mo758();

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1504(InterfaceC5709 interfaceC5709);

    /* JADX INFO: renamed from: ۦؑ */
    public void m7115(AbstractC3959 abstractC3959) {
        abstractC3959.m7116();
        AbstractC3959 abstractC39510 = (AbstractC3959) this.f13234;
        abstractC3959.f13234 = abstractC39510;
        if (abstractC39510 != null) {
            abstractC39510.f13233 = abstractC3959;
        }
        abstractC3959.f13233 = this;
        this.f13234 = abstractC3959;
        AbstractC3959 abstractC39511 = (AbstractC3959) this.f13235;
        abstractC3959.f13235 = abstractC39511;
        if (((AbstractC3959) abstractC3959.f13234) == null) {
            abstractC39511.f13237 = abstractC3959;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public String mo3184() {
        return "";
    }

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo760();

    /* JADX INFO: renamed from: ۦۗ */
    public void m7116() {
        AbstractC3959 abstractC3959 = (AbstractC3959) this.f13233;
        if (abstractC3959 != null) {
            abstractC3959.f13234 = (AbstractC3959) this.f13234;
        } else {
            AbstractC3959 abstractC39510 = (AbstractC3959) this.f13235;
            if (abstractC39510 != null) {
                abstractC39510.f13232 = (AbstractC3959) this.f13234;
            }
        }
        AbstractC3959 abstractC39511 = (AbstractC3959) this.f13234;
        if (abstractC39511 != null) {
            abstractC39511.f13233 = abstractC3959;
        } else {
            AbstractC3959 abstractC39512 = (AbstractC3959) this.f13235;
            if (abstractC39512 != null) {
                abstractC39512.f13237 = abstractC3959;
            }
        }
        this.f13235 = null;
        this.f13234 = null;
        this.f13233 = null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m7117(Object obj) {
        synchronized (this.f13237) {
            Object obj2 = this.f13233;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f13233 = obj;
                ((ExecutorC0170) ((C1489) this.f13235).f5056).execute(new RunnableC5689(6, AbstractC0973.m2039((LinkedHashSet) this.f13234), this));
            }
        }
    }

    public AbstractC3959() {
        this.f13236 = 1;
        this.f13235 = null;
        this.f13232 = null;
        this.f13237 = null;
        this.f13233 = null;
        this.f13234 = null;
    }
}
