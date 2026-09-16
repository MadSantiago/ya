package p000;

/* JADX INFO: renamed from: ۥَٕؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0269 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC3292 f966;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC3292 f967;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3292 f968;

    /* JADX INFO: renamed from: ۦؑ */
    public final float[] f969;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0269(AbstractC3292 abstractC3292, AbstractC3292 abstractC3293, int i) {
        AbstractC3292 abstractC3292M6792 = AbstractC5568.m9384(abstractC3292.f11027, 12884901888L) ? AbstractC3801.m6792(abstractC3292) : abstractC3292;
        AbstractC3292 abstractC3292M6793 = AbstractC5568.m9384(abstractC3293.f11027, 12884901888L) ? AbstractC3801.m6792(abstractC3293) : abstractC3293;
        float[] fArrM9595 = AbstractC5568.f18383;
        float[] fArr = null;
        if (i == 3) {
            boolean zM9384 = AbstractC5568.m9384(abstractC3292.f11027, 12884901888L);
            boolean zM9385 = AbstractC5568.m9384(abstractC3293.f11027, 12884901888L);
            if ((!zM9384 || !zM9385) && (zM9384 || zM9385)) {
                C5780 c5780 = ((C4017) (zM9384 ? abstractC3292 : abstractC3293)).f13390;
                float[] fArrM9596 = zM9384 ? c5780.m9595() : fArrM9595;
                fArrM9595 = zM9385 ? c5780.m9595() : fArrM9595;
                fArr = new float[]{fArrM9596[0] / fArrM9595[0], fArrM9596[1] / fArrM9595[1], fArrM9596[2] / fArrM9595[2]};
            }
        }
        this(abstractC3293, abstractC3292M6792, abstractC3292M6793, fArr);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public long mo562(long j) {
        float fM2830 = C1327.m2830(j);
        float fM2825 = C1327.m2825(j);
        float fM2829 = C1327.m2829(j);
        float fM2823 = C1327.m2823(j);
        AbstractC3292 abstractC3292 = this.f967;
        long jMo6060 = abstractC3292.mo6060(fM2830, fM2825, fM2829);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo6060 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo6060 & 4294967295L));
        float fMo6056 = abstractC3292.mo6056(fM2830, fM2825, fM2829);
        float[] fArr = this.f969;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo6056 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f966.mo6057(f, f2, fMo6056, fM2823, this.f968);
    }

    public C0269(AbstractC3292 abstractC3292, AbstractC3292 abstractC3293, AbstractC3292 abstractC3294, float[] fArr) {
        this.f968 = abstractC3292;
        this.f967 = abstractC3293;
        this.f966 = abstractC3294;
        this.f969 = fArr;
    }
}
