package p000;

import android.content.Intent;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۥؚْؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0787 extends AbstractC4105 {

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ WorkDatabase_Impl f2837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f2837 = workDatabase_Impl;
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۥّ */
    public final void mo1686(InterfaceC3879 interfaceC3879) {
        C3251 c3251M4189 = AbstractC2164.m4189();
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC0252Mo971.mo533()) {
            try {
                c3251M4189.add(interfaceC0252Mo971.mo534(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1434.m3052(interfaceC0252Mo971, th);
                    throw th2;
                }
            }
        }
        AbstractC1434.m3052(interfaceC0252Mo971, null);
        ListIterator listIterator = AbstractC2164.m4187(c3251M4189).listIterator(0);
        while (true) {
            C3740 c3740 = (C3740) listIterator;
            if (!c3740.hasNext()) {
                return;
            }
            String str = (String) c3740.next();
            if (str.startsWith("room_fts_content_sync_")) {
                C4773.m8153(interfaceC3879, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1687(InterfaceC3879 interfaceC3879) {
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `Dependency`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `WorkSpec`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `WorkTag`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `SystemIdInfo`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `WorkName`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `WorkProgress`");
        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1688(InterfaceC3879 interfaceC3879) {
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C4773.m8153(interfaceC3879, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1689(InterfaceC3879 interfaceC3879) {
        C4773.m8153(interfaceC3879, "PRAGMA foreign_keys = ON");
        C4775 c4775 = this.f2837.f250;
        if (c4775 == null) {
            c4775 = null;
        }
        C3757 c3757 = c4775.f15739;
        c3757.getClass();
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("PRAGMA query_only");
        try {
            interfaceC0252Mo971.mo533();
            boolean z = interfaceC0252Mo971.getLong(0) != 0;
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            if (!z) {
                C4773.m8153(interfaceC3879, "PRAGMA temp_store = MEMORY");
                C4773.m8153(interfaceC3879, "PRAGMA recursive_triggers = 1");
                C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c3757.f12514) {
                    C4773.m8153(interfaceC3879, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    C4773.m8153(interfaceC3879, AbstractC4981.m8362("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C1405 c1405 = c3757.f12512;
                ReentrantLock reentrantLock = (ReentrantLock) c1405.f4836;
                reentrantLock.lock();
                try {
                    c1405.f4837 = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (c4775.f15746) {
                try {
                    C5024 c5024 = c4775.f15747;
                    if (c5024 != null) {
                        Intent intent = c4775.f15743;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c5024.m8442(intent);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC1434.m3052(interfaceC0252Mo971, th3);
                throw th4;
            }
        }
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۦۙ */
    public final C0946 mo1690(InterfaceC3879 interfaceC3879) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new C0751(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap.put("prerequisite_id", new C0751(2, 1, "prerequisite_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        linkedHashSet.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("prerequisite_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C2886("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        linkedHashSet2.add(new C2886("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
        C3254 c3254 = new C3254("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        C3254 c3254M7439 = AbstractC4225.m7439(interfaceC3879, "Dependency");
        if (!c3254.equals(c3254M7439)) {
            return new C0946("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c3254 + "\n Found:\n" + c3254M7439, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new C0751(1, 1, "id", "TEXT", null, true));
        linkedHashMap2.put("state", new C0751(0, 1, "state", "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new C0751(0, 1, "worker_class_name", "TEXT", null, true));
        linkedHashMap2.put("input_merger_class_name", new C0751(0, 1, "input_merger_class_name", "TEXT", null, true));
        linkedHashMap2.put("input", new C0751(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new C0751(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new C0751(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new C0751(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new C0751(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new C0751(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new C0751(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new C0751(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new C0751(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap2.put("minimum_retention_duration", new C0751(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new C0751(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new C0751(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new C0751(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new C0751(0, 1, "period_count", "INTEGER", "0", true));
        linkedHashMap2.put("generation", new C0751(0, 1, "generation", "INTEGER", "0", true));
        linkedHashMap2.put("next_schedule_time_override", new C0751(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new C0751(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        linkedHashMap2.put("stop_reason", new C0751(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new C0751(0, 1, "trace_tag", "TEXT", null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new C0751(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new C0751(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new C0751(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new C0751(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new C0751(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new C0751(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new C0751(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new C0751(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new C0751(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        linkedHashMap2.put("content_uri_triggers", new C0751(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new C2886("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
        linkedHashSet4.add(new C2886("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
        C3254 c3255 = new C3254("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        C3254 c3254M74310 = AbstractC4225.m7439(interfaceC3879, "WorkSpec");
        if (!c3255.equals(c3254M74310)) {
            return new C0946("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c3255 + "\n Found:\n" + c3254M74310, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new C0751(1, 1, "tag", "TEXT", null, true));
        linkedHashMap3.put("work_spec_id", new C0751(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new C2886("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        C3254 c3256 = new C3254("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        C3254 c3254M74311 = AbstractC4225.m7439(interfaceC3879, "WorkTag");
        if (!c3256.equals(c3254M74311)) {
            return new C0946("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c3256 + "\n Found:\n" + c3254M74311, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new C0751(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap4.put("generation", new C0751(2, 1, "generation", "INTEGER", "0", true));
        linkedHashMap4.put("system_id", new C0751(0, 1, "system_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        C3254 c3257 = new C3254("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        C3254 c3254M74312 = AbstractC4225.m7439(interfaceC3879, "SystemIdInfo");
        if (!c3257.equals(c3254M74312)) {
            return new C0946("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c3257 + "\n Found:\n" + c3254M74312, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new C0751(1, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("work_spec_id", new C0751(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new C2886("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        C3254 c3258 = new C3254("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        C3254 c3254M74313 = AbstractC4225.m7439(interfaceC3879, "WorkName");
        if (!c3258.equals(c3254M74313)) {
            return new C0946("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c3258 + "\n Found:\n" + c3254M74313, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new C0751(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap6.put("progress", new C0751(0, 1, "progress", "BLOB", null, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new C0305("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        C3254 c3259 = new C3254("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        C3254 c3254M74314 = AbstractC4225.m7439(interfaceC3879, "WorkProgress");
        if (!c3259.equals(c3254M74314)) {
            return new C0946("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c3259 + "\n Found:\n" + c3254M74314, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new C0751(1, 1, "key", "TEXT", null, true));
        linkedHashMap7.put("long_value", new C0751(0, 1, "long_value", "INTEGER", null, false));
        C3254 c32510 = new C3254("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        C3254 c3254M74315 = AbstractC4225.m7439(interfaceC3879, "Preference");
        if (c32510.equals(c3254M74315)) {
            return new C0946(null, true);
        }
        return new C0946("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c32510 + "\n Found:\n" + c3254M74315, false);
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1684() {
    }

    @Override // p000.AbstractC4105
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1685() {
    }
}
