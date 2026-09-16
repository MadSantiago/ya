package p000;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: ۥٖ۟ؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2457 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f8200;

    /* JADX INFO: renamed from: ۥُ */
    public Object f8201;

    /* JADX INFO: renamed from: ۥّ */
    public Object f8202;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f8203;

    /* JADX INFO: renamed from: ۥۜ */
    public Object f8204;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f8205 = 0;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f8206;

    /* JADX INFO: renamed from: ۦِ */
    public Object f8207;

    /* JADX INFO: renamed from: ۦٛ */
    public Object f8208;

    /* JADX INFO: renamed from: ۦۗ */
    public Object f8209;

    /* JADX INFO: renamed from: ۦۙ */
    public Object f8210;

    public C2457(C0605 c0605) {
        this.f8203 = c0605;
        C1784 c1784 = new C1784();
        c1784.f17782 = -1;
        this.f8200 = c1784;
        C2935 c2935 = new C2935(c0605);
        this.f8206 = c2935;
        this.f8201 = c2935;
        C1850 c1850 = c2935.f9864;
        this.f8202 = c1850;
        this.f8210 = c1850;
        this.f8207 = new C0863(new InterfaceC0705[16]);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static AbstractC5381 m4582(InterfaceC2252 interfaceC2252, AbstractC5381 abstractC5381) {
        AbstractC5381 abstractC5381Mo916;
        if (interfaceC2252 instanceof AbstractC5334) {
            abstractC5381Mo916 = ((AbstractC5334) interfaceC2252).mo916();
            abstractC5381Mo916.f17781 = AbstractC5490.m9192(abstractC5381Mo916);
        } else {
            C5203 c5203 = new C5203();
            c5203.f17781 = AbstractC5490.m9195(interfaceC2252);
            c5203.f17199 = interfaceC2252;
            new HashSet();
            abstractC5381Mo916 = c5203;
        }
        if (abstractC5381Mo916.f17786) {
            AbstractC3480.m6278("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC5381Mo916.f17785 = true;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 != null) {
            abstractC5382.f17780 = abstractC5381Mo916;
            abstractC5381Mo916.f17783 = abstractC5382;
        }
        abstractC5381.f17783 = abstractC5381Mo916;
        abstractC5381Mo916.f17780 = abstractC5381;
        return abstractC5381Mo916;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static AbstractC5381 m4583(AbstractC5381 abstractC5381) {
        boolean z = abstractC5381.f17786;
        if (z) {
            C1254 c1254 = AbstractC5490.f18100;
            if (!z) {
                AbstractC3480.m6278("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC5490.m9194(abstractC5381, -1, 2);
            abstractC5381.mo5606();
            abstractC5381.mo5609();
        }
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        AbstractC5381 abstractC5383 = abstractC5381.f17780;
        if (abstractC5382 != null) {
            abstractC5382.f17780 = abstractC5383;
            abstractC5381.f17783 = null;
        }
        if (abstractC5383 != null) {
            abstractC5383.f17783 = abstractC5382;
            abstractC5381.f17780 = null;
        }
        return abstractC5383;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m4584(InterfaceC2252 interfaceC2252, InterfaceC2252 interfaceC2253, AbstractC5381 abstractC5381) {
        if ((interfaceC2252 instanceof AbstractC5334) && (interfaceC2253 instanceof AbstractC5334)) {
            ((AbstractC5334) interfaceC2253).mo915(abstractC5381);
            if (abstractC5381.f17786) {
                AbstractC5490.m9190(abstractC5381);
                return;
            } else {
                abstractC5381.f17787 = true;
                return;
            }
        }
        if (!(abstractC5381 instanceof C5203)) {
            AbstractC3480.m6278("Unknown Modifier.Node type");
            return;
        }
        C5203 c5203 = (C5203) abstractC5381;
        boolean z = c5203.f17786;
        if (z) {
            if (!z) {
                AbstractC3480.m6278("unInitializeModifier called on unattached node");
            }
            if ((c5203.f17781 & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c5203)).m1796();
            }
        }
        c5203.f17199 = interfaceC2253;
        c5203.f17781 = AbstractC5490.m9195(interfaceC2253);
        if (c5203.f17786) {
            c5203.m8804(false);
        }
        if (abstractC5381.f17786) {
            AbstractC5490.m9190(abstractC5381);
        } else {
            abstractC5381.f17787 = true;
        }
    }

    public String toString() {
        switch (this.f8205) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                AbstractC5381 abstractC5381 = (AbstractC5381) this.f8210;
                C1850 c1850 = (C1850) this.f8202;
                if (abstractC5381 == c1850) {
                    sb.append("]");
                } else {
                    while (abstractC5381 != null && abstractC5381 != c1850) {
                        sb.append(String.valueOf(abstractC5381));
                        if (abstractC5381.f17783 == c1850) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            abstractC5381 = abstractC5381.f17783;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public boolean m4585(int i) {
        return (((AbstractC5381) this.f8210).f17782 & i) != 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m4586(AbstractC5381 abstractC5381, AbstractC1311 abstractC1311) {
        for (AbstractC5381 abstractC5382 = abstractC5381.f17780; abstractC5382 != null; abstractC5382 = abstractC5382.f17780) {
            if (abstractC5382 == ((C1784) this.f8200)) {
                C0605 c0605M1356 = ((C0605) this.f8203).m1356();
                abstractC1311.f4514 = c0605M1356 != null ? (C2935) c0605M1356.f2256.f8206 : null;
                this.f8201 = abstractC1311;
                return;
            } else {
                if ((abstractC5382.f17781 & 2) != 0) {
                    return;
                }
                abstractC5382.mo5610(abstractC1311);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C3245 m4587() {
        String strConcat = ((String) this.f8203) == null ? " transportName" : "";
        if (((C1273) this.f8202) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f8210) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f8204) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f8208) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new C3245((String) this.f8203, (Integer) this.f8206, (C1273) this.f8202, ((Long) this.f8210).longValue(), ((Long) this.f8204).longValue(), (HashMap) this.f8208, (Integer) this.f8201, (String) this.f8200, (byte[]) this.f8207, (byte[]) this.f8209);
        }
        C1078.m2276("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۥۜ */
    public void m4588(int r32, p000.C0863 r33, p000.C0863 r34, p000.AbstractC5381 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2457.m4588(int, ۥًؗۤ, ۥًؗۤ, ۦٖ۠ؒٔ, boolean):void");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m4589(String str, String str2) {
        HashMap map = (HashMap) this.f8208;
        if (map != null) {
            map.put(str, str2);
        } else {
            C1078.m2276("Property \"autoMetadata\" has not been set");
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m4590() {
        C2355 c2355;
        InterfaceC4384 interfaceC4384;
        C0605 c0605 = (C0605) this.f8203;
        AbstractC1311 abstractC1311 = (C2935) this.f8206;
        for (AbstractC5381 abstractC5381 = ((C1850) this.f8202).f17780; abstractC5381 != null; abstractC5381 = abstractC5381.f17780) {
            InterfaceC4933 interfaceC4933M9225 = AbstractC5537.m9225(abstractC5381);
            if (interfaceC4933M9225 != null) {
                AbstractC1311 abstractC1312 = abstractC5381.f17789;
                if (abstractC1312 != null) {
                    c2355 = (C2355) abstractC1312;
                    InterfaceC4933 interfaceC4933 = c2355.f7809;
                    c2355.m9799(interfaceC4933M9225);
                    if (interfaceC4933 != abstractC5381 && (interfaceC4384 = c2355.f4522) != null) {
                        ((C0281) interfaceC4384).m584();
                    }
                } else {
                    c2355 = new C2355(c0605, interfaceC4933M9225);
                    abstractC5381.mo5610(c2355);
                }
                abstractC1311.f4514 = c2355;
                c2355.f4530 = abstractC1311;
                abstractC1311 = c2355;
            } else {
                abstractC5381.mo5610(abstractC1311);
            }
        }
        C0605 c0605M1356 = c0605.m1356();
        abstractC1311.f4514 = c0605M1356 != null ? (C2935) c0605M1356.f2256.f8206 : null;
        this.f8201 = abstractC1311;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m4591() {
        for (AbstractC5381 abstractC5381 = (AbstractC5381) this.f8210; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo5611();
            if (abstractC5381.f17785) {
                C1254 c1254 = AbstractC5490.f18100;
                if (!abstractC5381.f17786) {
                    AbstractC3480.m6278("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5490.m9194(abstractC5381, -1, 1);
            }
            if (abstractC5381.f17787) {
                AbstractC5490.m9190(abstractC5381);
            }
            abstractC5381.f17785 = false;
            abstractC5381.f17787 = false;
        }
    }

    public /* synthetic */ C2457() {
    }
}
