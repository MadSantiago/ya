package p000;

import android.content.Context;
import androidx.work.WorkerParameters;
import ru.bluecat.yandexmapspatcher.p003ui.workers.UpdateJob;

/* JADX INFO: renamed from: ۦۥٟۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5726 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18868;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C5726 f18867 = new C5726(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C5726 f18859 = new C5726(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C5726 f18860 = new C5726(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final C5726 f18858 = new C5726(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C5726 f18861 = new C5726(4);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C5726 f18865 = new C5726(5);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C5726 f18866 = new C5726(6);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C5726 f18863 = new C5726(7);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C5726 f18864 = new C5726(8);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C5726 f18862 = new C5726(9);

    /* JADX INFO: renamed from: ۥؖ */
    public static final C5726 f18857 = new C5726(10);

    /* JADX INFO: renamed from: ۥؓ */
    public static final C5726 f18856 = new C5726(11);

    public /* synthetic */ C5726(int i) {
        this.f18868 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f18868;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                }
                return c2358;
            case 1:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5362 c5364 = (C5362) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c5364.m8982();
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5362 c5365 = (C5362) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!c5365.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c5365.m8982();
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5362 c5366 = (C5362) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!c5366.m9011(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c5366.m8982();
                }
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5362 c5367 = (C5362) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!c5367.m9011(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c5367.m8982();
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5362 c5368 = (C5362) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!c5368.m9011(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c5368.m8982();
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5362 c5369 = (C5362) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!c5369.m9011(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c5369.m8982();
                }
                return c2358;
            case 8:
                C5362 c53610 = (C5362) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!c53610.m9011(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    c53610.m8982();
                }
                return c2358;
            case 9:
                C5362 c53611 = (C5362) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!c53611.m9011(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    c53611.m8982();
                }
                return c2358;
            case 10:
                C5362 c53612 = (C5362) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (c53612.m9011(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4009.m7154(null, 0.0f, 0L, c53612, 0, 7);
                } else {
                    c53612.m8982();
                }
                return c2358;
            case 11:
                long j = ((C1327) obj2).f4595;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC4225.m7470(j));
            case 12:
                new C4441(new long[]{4423346380722537931L, 3817219311987903505L, 5860246085441506978L}).toString();
                new C4441(new long[]{-8491124476210244742L, -1999884468153628233L}).toString();
                return new C2197();
            case 13:
                new C4441(new long[]{-3702166984689023974L, 8772083936633297412L, -7306215701837687035L}).toString();
                new C4441(new long[]{8406444652090240646L, -4131169877066319218L}).toString();
                return new C3998();
            case 14:
                new C4441(new long[]{1302350379393324518L, -2559673952820444091L, 7611361223762648895L}).toString();
                new C4441(new long[]{7722706350022729210L, 7710591638173299855L}).toString();
                return new C5269((C2197) ((C2354) obj).m4427(AbstractC5041.m8557(C2197.class), null, null));
            case 15:
                new C4441(new long[]{5602893769414659813L, -1512604414299613712L, -7852698535917295111L}).toString();
                new C4441(new long[]{1253502877163468037L, 4272992728504257357L}).toString();
                return new C5648();
            case 16:
                new C4441(new long[]{-7687928545196472322L, -1955458580816044433L, 9091658872618762452L}).toString();
                new C4441(new long[]{-2781351309897079341L, 4237751475950243736L}).toString();
                return new C2314((C3998) ((C2354) obj).m4427(AbstractC5041.m8557(C3998.class), null, null));
            case 17:
                C2354 c2354 = (C2354) obj;
                new C4441(new long[]{-3665741299173209954L, -7773990879574728624L, -1180103170722784172L}).toString();
                new C4441(new long[]{-5395197716594512710L, 382092414605157759L}).toString();
                return new C2247((C5648) c2354.m4427(AbstractC5041.m8557(C5648.class), null, null), (C2197) c2354.m4427(AbstractC5041.m8557(C2197.class), null, null), (C2314) c2354.m4427(AbstractC5041.m8557(C2314.class), null, null));
            case 18:
                new C4441(new long[]{6085993388347315586L, 4804315176792360704L, 4029778710820152786L}).toString();
                new C4441(new long[]{8665202069873690823L, 7762198698662416450L}).toString();
                return new C3557((C3998) ((C2354) obj).m4427(AbstractC5041.m8557(C3998.class), null, null));
            case 19:
                new C4441(new long[]{8518077695264425482L, -7454868549993677881L, -4061561324453980451L}).toString();
                new C4441(new long[]{-1029349964457860943L, -7754542131756199023L}).toString();
                return new C1880();
            case 20:
                new C4441(new long[]{-7929524046311437415L, 9023722568666708824L, 2672724681777636364L}).toString();
                new C4441(new long[]{6770348153884473294L, -7294597457851526650L}).toString();
                return new C5081((C1880) ((C2354) obj).m4427(AbstractC5041.m8557(C1880.class), null, null));
            default:
                C2354 c2355 = (C2354) obj;
                new C4441(new long[]{2776358389951164303L, -8211132512322883942L, -2749950204844805200L}).toString();
                new C4441(new long[]{942961339847379902L, 2010266713352617409L}).toString();
                return new UpdateJob((C1880) c2355.m4427(AbstractC5041.m8557(C1880.class), null, null), (Context) c2355.m4427(AbstractC5041.m8557(Context.class), null, null), (WorkerParameters) c2355.m4427(AbstractC5041.m8557(WorkerParameters.class), null, null));
        }
    }
}
