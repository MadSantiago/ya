package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥَۢؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2613 implements InterfaceC5709 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final Pattern f8715 = Pattern.compile("^\\[([xX\\s])]\\s+(.*)");

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo3101(C3343 c3343) {
        m4944(c3343);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo3104(C3401 c3401) {
        m4944(c3401);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3105(C3813 c3813) {
        m4944(c3813);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥً */
    public final void mo3108(C1256 c1256) {
        m4944(c1256);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3110(AbstractC1112 abstractC1112) {
        m4944(abstractC1112);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3112(AbstractC2791 abstractC2791) {
        m4944(abstractC2791);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥْ */
    public final void mo3113(C3273 c3273) {
        m4944(c3273);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo3114(C4456 c4456) {
        m4944(c4456);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo3118(C2623 c2623) {
        m4944(c2623);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3128(C0674 c0674) {
        m4944(c0674);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4944(AbstractC3959 abstractC3959) {
        AbstractC3959 abstractC39510 = (AbstractC3959) abstractC3959.f13232;
        while (abstractC39510 != null) {
            AbstractC3959 abstractC39511 = (AbstractC3959) abstractC39510.f13234;
            abstractC39510.mo1504(this);
            abstractC39510 = abstractC39511;
        }
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo3135(C4374 c4374) {
        m4944(c4374);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3138(C2149 c2149) {
        m4944(c2149);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo3147(C1507 c1507) {
        m4944(c1507);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3151(C3523 c3523) {
        m4944(c3523);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٕ */
    public final void mo3156(C1799 c1799) {
        m4944(c1799);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٚ */
    public final void mo3158(C4839 c4839) {
        m4944(c4839);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3159(C1350 c1350) {
        m4944(c1350);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo3163(C0829 c0829) {
        m4944(c0829);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3164(C5141 c5141) {
        m4944(c5141);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo3165(C1011 c1011) {
        AbstractC3959 abstractC3959 = (AbstractC3959) c1011.f13232;
        if (abstractC3959 instanceof C3343) {
            AbstractC3959 abstractC39510 = (AbstractC3959) abstractC3959.f13232;
            if (abstractC39510 instanceof C1507) {
                Matcher matcher = f8715.matcher(((C1507) abstractC39510).f5120);
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!"x".equals(strGroup) && !"X".equals(strGroup)) {
                        z = false;
                    }
                    C0986 c0986 = new C0986(z);
                    C3343 c3343 = new C3343();
                    c0986.m7116();
                    AbstractC3959 abstractC39511 = (AbstractC3959) c1011.f13233;
                    c0986.f13233 = abstractC39511;
                    if (abstractC39511 != null) {
                        abstractC39511.f13234 = c0986;
                    }
                    c0986.f13234 = c1011;
                    c1011.f13233 = c0986;
                    AbstractC3959 abstractC39512 = (AbstractC3959) c1011.f13235;
                    c0986.f13235 = abstractC39512;
                    if (((AbstractC3959) c0986.f13233) == null) {
                        abstractC39512.f13232 = c0986;
                    }
                    String strGroup2 = matcher.group(2);
                    if (!TextUtils.isEmpty(strGroup2)) {
                        c3343.m7114(new C1507(strGroup2));
                    }
                    AbstractC3959 abstractC39513 = (AbstractC3959) abstractC39510.f13234;
                    while (abstractC39513 != null) {
                        AbstractC3959 abstractC39514 = (AbstractC3959) abstractC39513.f13234;
                        c3343.m7114(abstractC39513);
                        abstractC39513 = abstractC39514;
                    }
                    c0986.m7114(c3343);
                    AbstractC3959 abstractC39515 = (AbstractC3959) abstractC3959.f13234;
                    while (abstractC39515 != null) {
                        AbstractC3959 abstractC39516 = (AbstractC3959) abstractC39515.f13234;
                        c0986.m7114(abstractC39515);
                        abstractC39515 = abstractC39516;
                    }
                    c1011.m7116();
                    m4944(c0986);
                    return;
                }
            }
        }
        m4944(c1011);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo3166(C3475 c3475) {
        m4944(c3475);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo3168(C3811 c3811) {
        m4944(c3811);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo3174(C3157 c3157) {
        m4944(c3157);
    }
}
